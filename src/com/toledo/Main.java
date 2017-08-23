package com.toledo;

import com.google.inject.Guice;
import com.toledo.purchase.PurchaseProcessor;

public class Main {
	public static void main(String[] args) {
		
		Guice.createInjector(
				new FileBasedPurchaseProcesorModule("input.txt", "output.txt"))
//				new ConsolePurchaseProcesorModule())
		.getInstance(PurchaseProcessor.class)
		.process();
	}
}
