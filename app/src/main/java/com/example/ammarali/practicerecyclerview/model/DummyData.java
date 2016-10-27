package com.example.ammarali.practicerecyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a dummy data source, used to simulate the kind of input you might receive from a Database or Web source.
 * Created by Ammar.Ali on 10/26/16.
 */

public class DummyData {

    public class DerpData {

    }
        private static final String[] titles = {"Float like a butterfly, sting like a bee.", "He who is not courageous enough to take risks will accomplish nothing in life.",
                "Don't count the days, make the days count."};
        private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
                android.R.drawable.ic_menu_delete};

        public static List<ListItem> getListData() {
            List<ListItem> data = new ArrayList<>();

            //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
            //RecyclerView
            for (int x = 0; x < 4; x++) {
                //create ListItem with dummy data, then add them to our List
                for (int i = 0; i < titles.length && i < icons.length; i++) {
                    ListItem item = new ListItem();
                    item.setImageResId(icons[i]);
                    item.setTitle(titles[i]);
                    data.add(item);
                }
            }
            return data;
        }
    }

//  private static Context context;
//
//        ArrayList<ListItem> listData = getListData();
//
//  public static ArrayList<ListItem> getListData() {
//        ArrayList<ListItem> listMockData = new ArrayList<ListItem>();
//
//        String[] images = context.getResources().getStringArray(R.array.images_array);
//        String [] title = context.getResources().getStringArray(R.array.heading_array);
//        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
//        //RecyclerView
//        for (int x = 0; x < images.length; x++) {
//
////            for (int i = 0; i < titles.length && i < icons.length; i++) {
////                ListItem item = new ListItem();
////                item.setImageResId(icons[i]);
////                item.setTitle(titles[i]);
////                data.add(item);
//        //}
//
//        ListItem listData = new ListItem();
//        listData.setUrl(images[x]);
//        listData.setTitle(title[x]);
//        listMockData.add(listData);
//        }
//        return listMockData;
//        }