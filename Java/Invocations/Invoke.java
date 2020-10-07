package Invocations;

public class Invoke {
   public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars) {
      int totalPennies = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25) + (halfDollars * 50);
      return totalPennies;
   }

	public static int mp3Sizer(int songs, int videos, int photos) {
      double MBForSongs = songs * 3.04;
      double MBForVideos = videos * 89.3;
      double MBForPhotos = photos * 1.72;
      double total = MBForPhotos + MBForSongs + MBForVideos;
      int GBs = (int) Math.round(total / 990);
      return GBs;
   }
}
