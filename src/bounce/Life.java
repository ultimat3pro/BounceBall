package bounce;
/**
 * Extending Rect class, Life defines life objects in the game
 * which the player can potentially use the get more lives
 * 
 * @author Ahmed Ashraf
 *
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Life extends Rect{
	private Image image;
	private boolean active;
	
	public Life(int x, int y, int w, int h, String fileName) {
		super(x, y, w, h);
		image = Toolkit.getDefaultToolkit().getImage(fileName);
		active = true;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public void draw (Graphics g){
		if(active)	g.drawImage(image, getX(), getY(), null);
	}
	
	
}
