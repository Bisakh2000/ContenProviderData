package com.example.contenproviderdata;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContentProviderExample extends ContentProvider {

    public static final String PROVIDER_NAME= "com.example.contentproviderexample";
    public static final String URL = "content://" + PROVIDER_NAME + "/user";
    public static final Uri CONTENT_URL = Uri.parse(URL);
    public static final int Uricode = 1;
    public static UriMatcher URI_MATCHER = null;
    public static final String id = null, name="";

    static {
        URI_MATCHER = new UriMatcher(URI_MATCHER.NO_MATCH);
        URI_MATCHER.addURI(PROVIDER_NAME, "user", Uricode);
        URI_MATCHER.addURI(PROVIDER_NAME, "user/*", Uricode);
    }
    public ContentProviderExample(){

    }

    public void sharedPreferences(){

    }

    public static SQLiteDatabase db;
    public static final String DATABASE_NAME="contentproviderdatabase";
    public static final String TABLE_NAME="user";
    public static final String DATABASE_VERSION= "1";
    public static final String CREATE_DB_TABLE="create table " + TABLE_NAME + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+"name TEXT NOT NULL)";
    public static class DatabaseHelper extends SQLiteOpenHelper{

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME , null, Integer.parseInt(DATABASE_VERSION));
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            db.execSQL(CREATE_DB_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }


    @Override
    public boolean onCreate() {
        Context context=getContext();
        SQLiteOpenHelper sql = new SQLiteOpenHelper() {
            @Override
            public void onCreate(SQLiteDatabase sqLiteDatabase) {
                sqLiteDatabase.execSQL();
            }

            @Override
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            }
        }
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}
