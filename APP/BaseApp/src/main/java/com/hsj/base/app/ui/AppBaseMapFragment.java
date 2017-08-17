/*******************************************************************************
 * Copyright (c) 2017.   ShengJunHu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 ******************************************************************************/

package com.hsj.base.app.ui;

import com.hsj.base.lib.ui.BaseFragment;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/08/06 22:24
 * @Class:BaseMapFragment
 * @Description:地图Fragment
 */
public abstract class AppBaseMapFragment extends BaseFragment {

    public String TAG = this.getClass().getSimpleName();

    /**
     * 初始化网络
     */
    protected abstract void initHttp();

}

