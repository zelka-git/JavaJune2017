package classwork.solitare;

//
//class Card, from solitaire program
//written by Tim Budd, April 1997
//
/* Upgraded to Java 5.0, Sven-Olof Nystrom, 2005 */
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Card {
// public constants for card size
final public static int width = 71;
final public static int height = 96; //Actual dimensions

public enum Suit {HEART, SPADE, DIAMOND, CLUB};

private boolean faceup;
private int r;
private Suit suit;
private ImageIcon image;
private static ImageIcon back = new ImageIcon( "b1fv.gif");

	// constructor
Card (Suit sv, int rv) { 

suit = sv; 
r = rv; 
faceup = false; 

String rankName = 
    (new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"})[r];
String suitName = "foo bar";
switch (suit) {
case HEART: suitName= "h"; break;
case SPADE: suitName= "s"; break;
case DIAMOND: suitName= "d"; break;
case CLUB: suitName= "c"; break;
}
image = new ImageIcon(suitName+rankName+".gif");

}

	// access attributes of card
public int getRank () { return r; }

public Suit getSuit() { 
return suit; 
}

public boolean faceUp() { 
return faceup; 
}

public void flip() { 
faceup = ! faceup; 
}

public Color color() {
if (faceUp()) {
	if (suit == Suit.HEART || suit == Suit.DIAMOND) {
		return Color.red;
	} else {
		return Color.black;
	}
}
return Color.yellow;
}

public void draw (Graphics g, int x, int y) {

if (faceUp()) {
    g.drawImage(image.getImage(), x, y, new Frame());
}

else { // face down
    g.drawImage(back.getImage(), x, y, new Frame());
}
}
}
