package dbot;

import listener.Lunchlistener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = "NjI2NjA5NjY1MzIwNDE5MzU5.XYwn5g.HV-W5CQw28NeGY1puXDMl9sHLf4";
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new Lunchlistener());
			builder.build();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
