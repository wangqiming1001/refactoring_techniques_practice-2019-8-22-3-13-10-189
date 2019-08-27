package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tws.refactoring.extract_variable.BannerRender;

public class BannerRenderTest {
	
	@Test
	public void should_return_banner_when_given_non_ie() {
		//given
		BannerRender banerRender = new BannerRender();
		//when
		String  result = banerRender.renderBanner("MAC","chrome");
		//then
		assertEquals("banner", result);
	}
	
	@Test
	public void should_return_ie_on_mac_banner_when_given_mac_and_ie() {
		//given
		BannerRender banerRender = new BannerRender();
		//when
		String  result = banerRender.renderBanner("MAC","IE");
		//then
		assertEquals("IE on Mac?", result);
	}


}
