package com.example.demo.dto;

public class Metadata {
    
   private String url;
   private String title;
   private Long status;
   
@Override
public String toString() {
	return " { url: " + url + ", title: " + title + ", status: " + status + " } ";
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Long getStatus() {
	return status;
}
public void setStatus(Long status) {
	this.status = status;
}
  

}
