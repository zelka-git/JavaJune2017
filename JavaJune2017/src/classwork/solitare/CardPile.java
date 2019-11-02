package classwork.solitare;

//
//Abstraction for piles of cards for Solitaire game
//written by Tim Budd, April 1997
//
/* Upgraded to Java 5.0, Sven-Olof Nystrom, 2005 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Stack;

public class CardPile {
// coordinates of the card pile
protected int x;
protected int y;
protected Stack<Card> thePile;

// constructor
CardPile (int xl, int yl) 
{ x = xl; y = yl; thePile = new Stack<Card>(); }

// access to cards are not overridden
public final Card top() { return thePile.peek(); }

public final boolean isEmpty() { return thePile.empty(); }

public boolean available() {return ! isEmpty(); }

public Card pop() {

if (thePile.isEmpty()) {
	return null;
}

return thePile.pop();
}

public void turnUp() {
if (!thePile.isEmpty() &&
    ! thePile.peek().faceUp()) {
    thePile.peek().flip();
}
}

// the following are sometimes overridden
public boolean includes (int tx, int ty) {
return x <= tx && tx <= x + Card.width &&
    y <= ty && ty <= y + Card.height;
}

public void select (int tx, int ty) {
// do nothing
}

public void addCard (Card aCard)  
{ thePile.push(aCard); }

public void display (Graphics g) {
g.setColor(Color.blue);
if (isEmpty()) {
	g.drawRect(x, y, Card.width, Card.height);
} else {
	top().draw(g, x, y);
}
}

public boolean canTake (Card aCard) {
return false; 
}

}
