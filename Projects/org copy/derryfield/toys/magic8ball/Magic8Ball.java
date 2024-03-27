package org.derryfield.toys.magic8ball;

public class Magic8Ball {
    private String ans;
    private int value;
    private double r;

    public Magic8Ball() {
        ans = "Try again";
        value = 0;
        r = 1.0;
    }
    
    public void shake(double maxLimit) {
        r = Math.random() * maxLimit;
        value = ((int) r);
    }

    public void setAns() {
        String[] ansList = {"It is certain!", "It is decidedly so!",
            "Without a doubt!", "Yes definitely!", "You may rely on it.", 
            "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", 
            "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", 
            "Better not teel you now.", "Cannot predict now.", "Concentrate and ask again.", 
            "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", 
            "Very doubtful."};
        ans = ansList[value];
    }
    public String getAns() {
        return ans;
    }
}
