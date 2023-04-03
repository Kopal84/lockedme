package lockedme;



public class ScreenService {
	
	
	
	
	
	public static Welcome Welcome = new Welcome();
    public static Filescreen FileOptionsScreen = new Filescreen();
    
    

    public static screen CurrentScreen = Welcome;

    
    public static screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}

