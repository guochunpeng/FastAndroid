/*
 *   Copyright (c) 2017.  HSJ
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.hsj.me.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.hsj.common.ui.activity.BaseActivity;
import com.app.me.R;
import com.app.me.ui.fragment.MeFragment;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/6/14/09:46
 * @Class:MeActivity
 * @Description:
 */
public class MeActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_me;
    }

    @Override
    protected void initUI(Bundle savedInstanceState) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_me, new MeFragment())
                .commit();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {

    }
}
