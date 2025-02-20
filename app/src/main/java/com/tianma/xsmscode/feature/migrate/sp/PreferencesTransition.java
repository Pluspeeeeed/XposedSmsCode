package com.tianma.xsmscode.feature.migrate.sp;

import android.content.Context;

import com.tianma.xsmscode.feature.migrate.ITransition;
import com.tianma.xsmscode.common.utils.SPUtils;

/**
 * SharedPreferences 相关数据迁移
 */
public class PreferencesTransition implements ITransition {

    private static final int VERSION_CODE_16 = 16;

    public PreferencesTransition(Context context) {
        int mLocalVersionCode = SPUtils.getLocalVersionCode(context);
    }

    @Override
    public boolean shouldTransit() {
        return false;
    }

    @Override
    public boolean doTransition() {
        return false;
    }
}
