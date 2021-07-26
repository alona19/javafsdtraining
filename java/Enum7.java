package com.ust.examples;
enum WhoisRIR {
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");
	
	private final String url;
	WhoisRIR(String u){
		this.url=u;
	}
	
	public String getUrl() {
		System.out.println(this.url);
		return this.url;
	}
	
}

public class Enum7 {

	public static void main(String[] args) {
		WhoisRIR r1=WhoisRIR.APNIC;
		r1.getUrl();
		WhoisRIR r2=WhoisRIR.RIPE;
		r2.getUrl();

	}

}
