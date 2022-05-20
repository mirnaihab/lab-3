public class Digital_Watch {
    public boolean timer_state = false;
    public boolean open = false;
    public float timer = 0;

    public String setTimer(float time){
        if(open){
            timer = time;
            timer_state = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }
    public String On(){
        if(!open){
            open = true;
            return "Turned On!";
        }
        else{
            return "Already turned on";
        }
    }
    public String Do(){
        if(timer_state){
            return "Wait for timer ";
        }
        else{
            return "Accepted";
        }
    }
    public String Off(){
        if(open){
            open = false;
            return "it's off";
        }
        else{
            return "Error";
        }
    }

}
