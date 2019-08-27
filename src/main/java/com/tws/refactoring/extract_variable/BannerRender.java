package com.tws.refactoring.extract_variable;

public class BannerRender {
	private static final String MAC = "MAC";
	private static final String IE = "IE";
	private static final String IE_ON_MAC = "IE on Mac?";
	private static final String BANNER = "banner";
    public String renderBanner(String platform, String browser) {
		int variablePlatform = platform.toUpperCase().indexOf(MAC);
		int variableBrowserm = browser.toUpperCase().indexOf(IE);
		if ((variablePlatform > -1) &&(variableBrowserm > -1)) {
            return IE_ON_MAC;
        }
        return BANNER;
    }
}
