/*
 * Copyright 2019 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.matrix.android.internal.session.content

import dagger.Binds
import dagger.Module
import im.vector.matrix.android.api.session.content.ContentUploadStateTracker
import im.vector.matrix.android.api.session.content.ContentUrlResolver
import im.vector.matrix.android.internal.session.SessionScope

@Module
internal abstract class ContentModule {

    @Binds
    @SessionScope
    abstract fun bindContentUploadStateTracker(contentUploadStateTracker: DefaultContentUploadStateTracker): ContentUploadStateTracker

    @Binds
    @SessionScope
    abstract fun bindContentUrlResolver(contentUrlResolver: DefaultContentUrlResolver): ContentUrlResolver
}
