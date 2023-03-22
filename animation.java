import java.awt.*;
import java.applet.*;
/*
<applet code="AnimationEx.class" width="600" height="800">
</applet>
*/
public class AnimationEx 

extends Applet
{
	Image pic;
	public void init();
	{
		pic=getImage(getDocumentBase(),"bike.jpg");
	}
	public void paint(Graphics grap)
	{
		for(int i=50;i<100;i++)
		{
			grp.drawImage(pic,i,30,this);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e){}
		}
	}
}