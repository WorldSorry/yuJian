package com.hoping.yujian.greendao;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * Master of DAO (schema version 1): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {

    public DaoMaster(Database db, int schemaVersion) {
        super(db, schemaVersion);
    }

    @Override
    public AbstractDaoSession newSession() {
        return null;
    }

    @Override
    public AbstractDaoSession newSession(IdentityScopeType type) {
        return null;
    }
}