package oops;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-15s | %-17s | %-8s%n", "Video Name", "Checkout Status", "Rating");
        for (video v : store) {
            System.out.printf("%-15s | %-17s | %-8d%n", v.getName(), v.getCheckout(), v.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}