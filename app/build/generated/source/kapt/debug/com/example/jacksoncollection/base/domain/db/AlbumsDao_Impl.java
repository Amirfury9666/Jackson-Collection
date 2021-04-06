package com.example.jacksoncollection.base.domain.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.jacksoncollection.base.domain.response.Album;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AlbumsDao_Impl implements AlbumsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AlbumEntity> __insertionAdapterOfAlbumEntity;

  private final AlbumConverter __albumConverter = new AlbumConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllAlbums;

  public AlbumsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlbumEntity = new EntityInsertionAdapter<AlbumEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `album_table` (`Id`,`albums`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AlbumEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __albumConverter.convertToString(value.getAlbums());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAllAlbums = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM album_table";
        return _query;
      }
    };
  }

  @Override
  public void insertAlbums(final AlbumEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlbumEntity.insert(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllAlbums() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllAlbums.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllAlbums.release(_stmt);
    }
  }

  @Override
  public LiveData<AlbumEntity> getAllAlbums() {
    final String _sql = "SELECT * FROM album_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"album_table"}, false, new Callable<AlbumEntity>() {
      @Override
      public AlbumEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
          final int _cursorIndexOfAlbums = CursorUtil.getColumnIndexOrThrow(_cursor, "albums");
          final AlbumEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final ArrayList<Album> _tmpAlbums;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfAlbums);
            _tmpAlbums = __albumConverter.convertToFeed(_tmp);
            _result = new AlbumEntity(_tmpId,_tmpAlbums);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
