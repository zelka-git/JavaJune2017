package classwork.solitare;

/*
Simple Solitare Card Game in Java
Written by Tim Budd, Oregon State University, 1996
*/
/* Upgraded to Java 5.0, Sven-Olof Nystrom, 2005 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Enumeration;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SuitPile extends CardPile {

  SuitPile (int x, int y) { super(x, y); }

  @Override
public boolean canTake (Card aCard) {
	if (isEmpty()) {
		return aCard.getRank() == 0;
	}
	Card topCard = top();
	return (aCard.getSuit() == topCard.getSuit()) &&
	    (aCard.getRank() == 1 + topCard.getRank());
  }
}

class DeckPile extends CardPile {

  DeckPile (int x, int y) {
	// first initialize parent
	super(x, y);
	// then create the new deck
	// first put them into a local pile
	for (Card.Suit i : Card.Suit.values()) {
		for (int j = 0; j <= 12; j++) {
			addCard(new Card(i, j));
		}
	}

	// then shuffle the cards
	Random generator = new Random();
	for (int i = 0; i < 52; i++) {
	    int j = Math.abs(generator.nextInt() % 52);
	    // swap the two card values
	    Card temp = thePile.elementAt(i);
	    thePile.setElementAt(thePile.elementAt(j), i);
	    thePile.setElementAt(temp, j);
	}
  }

  @Override
public void select(int tx, int ty) {
	if (isEmpty()) {
		while (!Solitare.discardPile.isEmpty()) {
		Card c = Solitare.discardPile.pop();
		c.flip();
		addCard(c);
	    }
	}
	Solitare.discardPile.addCard(pop());
  }
}

class DiscardPile extends CardPile {
	
  DiscardPile (int x, int y) { super (x, y); }

  @Override
public void addCard (Card aCard) {
	if (! aCard.faceUp()) {
		aCard.flip();
	}
	super.addCard(aCard);
  }

  @Override
public void select (int tx, int ty) {
	if (isEmpty()) {
		return;
	}
	Card topCard = pop();
	for (int i = 0; i < 4; i++) {
		if (Solitare.suitPile[i].canTake(topCard)) {
		Solitare.suitPile[i].addCard(topCard);
		return;
	    }
	}
	for (int i = 0; i < 7; i++) {
		if (Solitare.tableau[i].canTake(topCard)) {
		Solitare.tableau[i].addCard(topCard);
		return;
	    }
	}
	// nobody can use it, put it back on our list
	addCard(topCard);
  }
}


class TablePile extends CardPile {

  TablePile (int x, int y, int c) {
	// initialize the parent class
	super(x, y);
	// then initialize our pile of cards
	for (int i = 0; i < c; i++) {
	    addCard(Solitare.deckPile.pop());
	}
	// flip topmost card face up
	top().flip();
  }

  @Override
public boolean canTake (Card aCard) {
	if (isEmpty()) {
		return aCard.getRank() == 12;
	}
	Card topCard = top();
	return (aCard.color() != topCard.color()) &&
	    (aCard.getRank() == topCard.getRank() - 1);
  }

  @Override
public boolean includes (int tx, int ty) {
	// don't test bottom of card
	return x <= tx && tx <= x + Card.width &&
	    y <= ty;
  }

  @Override
public void select (int tx, int ty) {
	if (isEmpty()) {
		return;
	}

	// if face down, then flip
	Card topCard = top();
	if (! topCard.faceUp()) {
	    topCard.flip();
	    return;
	}

	// else see if any suit pile can take card
	topCard = pop();
	for (int i = 0; i < 4; i++) {
		if (Solitare.suitPile[i].canTake(topCard)) {
		Solitare.suitPile[i].addCard(topCard);
		return;
	    }
	}
	// else see if any other table pile can take card
	for (int i = 0; i < 7; i++) {
		if (Solitare.tableau[i].canTake(topCard)) {
		Solitare.tableau[i].addCard(topCard);
		return;
	    }
	}
	// else put it back on our pile
	addCard(topCard);
  }

  @Override
public void display (Graphics g) {
	int localy = y;
	for (Enumeration e = thePile.elements(); e.hasMoreElements(); ) {
	    Card aCard = (Card) e.nextElement();
	    aCard.draw (g, x, localy);
	    localy += 35;
	}
  }
}

public class Solitare extends JFrame {
  static public DeckPile deckPile;
  static public DiscardPile discardPile;
  static public TablePile tableau [ ];
  static public SuitPile suitPile [ ];
  static public CardPile allPiles [ ];

  static public void main (String [ ] args) {
	Solitare world = new Solitare();
  }

  public Solitare () {
	init();

	setSize(600, 500);
	setTitle("Solitaire Game");

	MouseKeeper mk = new MouseKeeper();
	addMouseListener (mk);
	addMouseMotionListener(mk);
	
	JButton restartButton = new JButton("New Game");
	restartButton.addActionListener(new RestartButtonListener());
	add("Center", new SolitairePanel());
	add("South", restartButton);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	setVisible(true);
  }

  private void init () {
	// first allocate the arrays
	allPiles = new CardPile[13];
	suitPile = new SuitPile[4];
	tableau = new TablePile[7];
	// then fill them in
	
	int topSpace = 30;
	int sideSpace = 10;
	
	int deckCol = 4*Card.width + 6* sideSpace;

	allPiles[0] = deckPile = new DeckPile(deckCol, topSpace);

	int discardCol = 5*Card.width + 7* sideSpace;
	allPiles[1] = discardPile = new DiscardPile(discardCol, topSpace);
	for (int i = 0; i < 4; i++) {
		allPiles[2+i] = suitPile[i] =
		new SuitPile(sideSpace + (Card.width+sideSpace) * i, topSpace);
	}
	for (int i = 0; i < 7; i++) {
		allPiles[6+i] = tableau[i] =
		new TablePile(sideSpace + (Card.width+sideSpace) * i, 
			      Card.height + 2 * topSpace, i+1);
	} 
  }

  private class RestartButtonListener implements ActionListener {
	@Override
	public void actionPerformed (ActionEvent e) {
	    init();
	    repaint();
	}
  }

  private class MouseKeeper extends MouseAdapter 
	implements MouseMotionListener {

	private CardPile source;
	MouseEvent e0;

	private void shadow (MouseEvent e) {
	    final int w = Card.width;
	    final int h =  Card.height;

	    if (e != null) {

		int x = e.getX();
		int y = e.getY();

		Graphics g = ((Component)e.getSource()).getGraphics(); 
		g.setXORMode(Color.gray);

		g.drawRect(x-w/2, y-w/2, w, h);
	    }		
	}

	@Override
	public void mouseClicked (MouseEvent e) { 
	    
	    int x = e.getX();
	    int y = e.getY();
	    for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
			    allPiles[i].select(x,y);
			    repaint();
			}
		}
	}


	@Override
	public void mousePressed (MouseEvent e) { 

	    shadow(e);
	    e0 = e;

	    int x = e.getX();
	    int y = e.getY();
	    for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
			    source = allPiles[i];
			}
		}
	}

	@Override
	public void mouseDragged (MouseEvent e) {
	    
	    shadow(e0);
	    shadow(e);
	    e0 = e;
	}	    

	@Override
	public void mouseReleased (MouseEvent e) {
	    
	    CardPile target = null;

	    shadow (e0);
	    e0 = null;

	    int x = e.getX();
	    int y = e.getY();

	    for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
			    target = allPiles[i];
			}
		}
	    if (target != null && 
		source != null &&
		source.available() && 
		target.canTake(source.top())) {
		
		target.addCard(source.pop());
		source.turnUp();

		repaint();
	    }

	    source = null;
	}
	
	@Override
	public void mouseMoved (MouseEvent e) {}


  }


  class SolitairePanel extends JPanel {
  
	@Override
	public void paint(Graphics g) {
	    super.paint(g);
	    for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}
  }
}
