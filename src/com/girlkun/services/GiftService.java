package com.girlkun.services;

import com.girlkun.data.ItemData;
import com.girlkun.models.item.Item;
import com.girlkun.models.item.Item.ItemOption;
import com.girlkun.models.player.Player;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

//import static sun.audio.AudioPlayer.player; commented this

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class GiftService {

    private static GiftService i;

    private GiftService() {

    }

    public String code;
    public int idGiftcode;
    public int gold;
    public int gem;
    public int dayexits;
    public Timestamp timecreate;
    public ArrayList<Item> listItem = new ArrayList<>();
    public static ArrayList<GiftService> gifts = new ArrayList<>();

    public static GiftService gI() {
        if (i == null) {
            i = new GiftService();
        }
        return i;
    }

    public void giftCode(Player player, String code) {

    }

}
