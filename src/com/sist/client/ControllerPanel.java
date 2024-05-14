package com.sist.client;
import javax.swing.*;
import java.awt.Color;
import java.awt.CardLayout;
public class ControllerPanel extends JPanel {
		public CardLayout card=new CardLayout();
		public HomePanel hp=new HomePanel();
		public MarketPanel mp=new MarketPanel();
		public CommunityPanel cp=new CommunityPanel();
		
		public ControllerPanel() {
			setLayout(card);
			add("HOME",hp);
			add("MARKET",mp);
			add("COMMUNITY",cp);
		}
}
