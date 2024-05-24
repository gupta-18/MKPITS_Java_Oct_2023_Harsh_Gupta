package com.mkpits.tree;

public class TreeNodeDemoCalling {

	public static void main(String[] args) {

		TreeNodeDemo drinks = new TreeNodeDemo("Daru:-");
		
		TreeNodeDemo whiskey = new TreeNodeDemo("\nWhiskey");
		TreeNodeDemo blackdog = new TreeNodeDemo("Black Dog");
		TreeNodeDemo jackdaniels = new TreeNodeDemo("Jack Daniels");
		TreeNodeDemo royalstag = new TreeNodeDemo("Royal Stag");
		TreeNodeDemo blacklable = new TreeNodeDemo("Black Lable");
		
		
		TreeNodeDemo vodka = new TreeNodeDemo("\nVodka");
        TreeNodeDemo magicMoment = new TreeNodeDemo("Magic Moment");
		
		TreeNodeDemo chocolateMagic = new TreeNodeDemo("Chocolate");
		TreeNodeDemo greenAppleMagic = new TreeNodeDemo("Green Apple");
		TreeNodeDemo lemonMagic = new TreeNodeDemo("Lemon");
		
		
		TreeNodeDemo rum = new TreeNodeDemo("\nRum");
		TreeNodeDemo  bacardi = new TreeNodeDemo("Bacardi White Rum");
		TreeNodeDemo  oldmonk = new TreeNodeDemo("Old Monk");
		
		TreeNodeDemo beer = new TreeNodeDemo("\nBeer");
		TreeNodeDemo magnum = new TreeNodeDemo("Budwiser Magnum");
		TreeNodeDemo kingfisher = new TreeNodeDemo("King-Fisher");
		TreeNodeDemo beera = new TreeNodeDemo("Beera");
		TreeNodeDemo tuborg = new TreeNodeDemo("Tuborg");
		TreeNodeDemo ultra = new TreeNodeDemo("Ultra");
		
		drinks.child(beer);
		beer.child(magnum);
		beer.child(kingfisher);
		beer.child(beera);
		beer.child(tuborg);
		beer.child(ultra);
		
		drinks.child(whiskey);
		whiskey.child(blackdog);
		whiskey.child(jackdaniels);
		whiskey.child(royalstag);
		whiskey.child(blacklable);
		
		drinks.child(vodka);
		vodka.child(magicMoment);
		magicMoment.child(lemonMagic);
		magicMoment.child(greenAppleMagic);
		magicMoment.child(chocolateMagic);
		
		drinks.child(rum);
		rum.child(bacardi);
		rum.child(oldmonk);
		
		
		System.out.println(drinks.print(0));
		
		
		
	}

}
