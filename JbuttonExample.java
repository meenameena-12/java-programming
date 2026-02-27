import javax.swng.*;
public class JbuttonExample{
  Jframe frame=new Jframe("button example");
  Jbutton btn=new Jbutton("click me");
  btn.set bounds(100,70,120,30);
  btn.add action listener(new action listener(){
    public void action performed(action eventg e){
      system.out.println("button clicked");
    }
  });
  frame.add(btn);
  frame.set size(300,200);
  frame.setlayout(null);
  frame.set default close operation(Jframe.exit.on.close);
  frame.visible("true);
                
                          
      
    