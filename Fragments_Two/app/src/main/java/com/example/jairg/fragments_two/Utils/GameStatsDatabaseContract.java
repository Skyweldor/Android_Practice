package com.example.jairg.fragments_two.Utils;

import android.provider.BaseColumns;

public class GameStatsDatabaseContract {
    private GameStatsDatabaseContract() {
    }

    public static final class PlayerStats implements BaseColumns {
        public static final String TABLE_NAME = "player_stats";
        public static final String COLUMN_PLAYER_ID = "player_id";
        public static final String COLUMN_PLAYER_NAME = "player_name";
        public static final String COLUMN_PLAYER_GOLD = "player_gold";
        public static final String COLUMN_PLAYER_XP = "player_xp";
        public static final String COLUMN_PLAYER_AP = "player_ap";

        // insertStats("player_id", "player_name", player_gold, player_xp, player_ap);

        public static final String SQL_CREATE_TABLE =
                "CREATE_TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_PLAYER_ID + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_PLAYER_NAME + " TEXT UNIQUE NOT NULL" +
                        COLUMN_PLAYER_GOLD + " INT, " +
                        COLUMN_PLAYER_XP + "INT, " +
                        COLUMN_PLAYER_AP + "INT)";

        public static final String SQL_DELETE_TABLE =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    public static final class GameCharacterStats implements BaseColumns {
        public static final String TABLE_NAME = "gameCharacter_stats";
        public static final String COLUMN_CHARACTER_ID = "character_id";
        public static final String COLUMN_CHARACTER_STR = "character_str";
        public static final String COLUMN_CHARACTER_HP = "character_hp";
        public static final String COLUMN_CHARACTER_CRIT = "character_crit";
        public static final String COLUMN_CHARACTER_ACC = "character_acc";
        public static final String COLUMN_CHARACTER_SPD = "character_spd";
        public static final String COLUMN_CHARACTER_EVA = "character_eva";
        public static final String COLUMN_CHARACTER_NAME = "character_name";
        public static final String COLUMN_CHARACTER_DESCRIPTION = "character_description";
        public static final String COLUMN_ITEM_1 = "item_1"; // Head
        public static final String COLUMN_ITEM_2 = "item_2"; // Main-Hand
        public static final String COLUMN_ITEM_3 = "item_3"; // Off-Hand
        public static final String COLUMN_ITEM_4 = "item_4"; // Torso
        public static final String COLUMN_ITEM_5 = "item_5"; // Bottoms

        public static final String SQL_CREATE_TABLE =
                "CREATE_TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_CHARACTER_ID + " TEXT NOT NULL, " +
                        COLUMN_CHARACTER_STR + " INT NOT NULL, " +
                        COLUMN_CHARACTER_HP + " INT NOT NULL, " +
                        COLUMN_CHARACTER_CRIT + " INT NOT NULL, " +
                        COLUMN_CHARACTER_ACC + " INT NOT NULL, " +
                        COLUMN_CHARACTER_SPD + " INT NOT NULL, " +
                        COLUMN_CHARACTER_EVA + " INT NOT NULL, " +
                        COLUMN_CHARACTER_NAME + " INT NOT NULL, " +
                        COLUMN_CHARACTER_DESCRIPTION + " INT NOT NULL, " +
                        COLUMN_ITEM_1 + " TEXT , " +
                        COLUMN_ITEM_2 + " TEXT , " +
                        COLUMN_ITEM_3 + " TEXT , " +
                        COLUMN_ITEM_4 + " TEXT , " +
                        COLUMN_ITEM_5 + " TEXT)";

        public static final String SQL_DELETE_TABLE =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    public static final class ItemStats implements BaseColumns {
        public static final String TABLE_NAME = "item_stats";
        public static final String COLUMN_ITEM_ID = "item_id";
        public static final String COLUMN_ITEM_STR = "item_str";
        public static final String COLUMN_ITEM_HP = "item_hp";
        public static final String COLUMN_ITEM_CRIT = "item_crit";
        public static final String COLUMN_ITEM_ACC = "item_acc";
        public static final String COLUMN_ITEM_SPD = "item_spd";
        public static final String COLUMN_ITEM_EVA = "item_eva";
        public static final String COLUMN_ITEM_NAME = "item_name";
        public static final String COLUMN_ITEM_DESCRIPTION = "item_description";

        public static final String SQL_CREATE_TABLE =
                "CREATE_TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_ITEM_ID + " TEXT NOT NULL, " +
                        COLUMN_ITEM_STR + " INT, " +
                        COLUMN_ITEM_HP + " INT, " +
                        COLUMN_ITEM_CRIT + " INT, " +
                        COLUMN_ITEM_ACC + " INT, " +
                        COLUMN_ITEM_SPD + " INT, " +
                        COLUMN_ITEM_EVA + " INT, " +
                        COLUMN_ITEM_NAME + " TEXT NOT NULL, " +
                        COLUMN_ITEM_DESCRIPTION + " TEXT NOT NULL)";

        public static final String SQL_DELETE_TABLE =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
