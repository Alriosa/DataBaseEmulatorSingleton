package Main;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import entities.*;

public class MainClass {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton("url","dataBase");
		System.out.println(singleton.getUrl());
		System.out.println(singleton.getDataBase());

	}

}
