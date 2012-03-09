/***
Copyright (c) 2012 CommonsWare, LLC

Licensed under the Apache License, Version 2.0 (the "License"); you may
not use this file except in compliance with the License. You may obtain
a copy of the License at
  http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.commonsware.cwac.updater;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.commonsware.cwac.wakeful.WakefulIntentService;

public class WakefulReceiver extends BroadcastReceiver {

  @Override
  public void onReceive(Context context, Intent intent) {
    Intent cmd=
        (Intent)intent.getParcelableExtra(UpdateRequest.EXTRA_COMMAND);

    WakefulIntentService.sendWakefulWork(context, cmd);
  }
}
