
package com.example.android.habittrackerapp.data;

import android.provider.BaseColumns;

public final class HabitContract {

    private HabitContract() {}

    public static final class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "Habits";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_HABIT_NAME ="name";

        public final static String COLUMN_HABIT_DATE = "date";

        public final static String COLUMN_HABIT_REPETITION = "repetition";

    }

}

