package entities;

public class Singleton {
 private String url;
 private String dataBase;
 private static Singleton singleton = null;
 
 public static Singleton getSingleton(String url,String dataBase) {
	 if (singleton == null) {
		 singleton = new Singleton(url,dataBase);
	 }
	 return singleton;
 }
 
 
 private Singleton(String url,String dataBase){
	 this.url=url;
	 this.dataBase=dataBase;
 }
 
 
 public String getUrl() {
	 return url;
 }
 
public void setUrl(String url) {
	this.url = url;
}

public String getDataBase() {
	return dataBase;
}

public void setDataBase(String dataBase) {
	this.dataBase = dataBase;
}
}
