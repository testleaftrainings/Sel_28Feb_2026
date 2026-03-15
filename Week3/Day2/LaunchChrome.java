package org.testleaf.week3.day2;
//             child       extends Parent
public class LaunchChrome extends LaunchBrowser{

    public void launch(){
        super.launch();
        System.out.println("Launch chrome");
    }

    public static void main(String[] args) {
        LaunchChrome launchOptions=new LaunchChrome();
        launchOptions.launch();
    }

}
