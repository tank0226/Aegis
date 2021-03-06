package com.beemdevelopment.aegis.licenses;

import android.content.Context;

import com.beemdevelopment.aegis.R;

import de.psdev.licensesdialog.licenses.License;

public class GlideLicense extends License {
    @Override
    public String getName() {
        return "Glide License";
    }

    @Override
    public String readSummaryTextFromResources(Context context) {
        return getContent(context, R.raw.glide_license);
    }

    @Override
    public String readFullTextFromResources(Context context) {
        return getContent(context, R.raw.glide_license);
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getUrl() {
        return "https://github.com/bumptech/glide/blob/master/LICENSE";
    }
}
