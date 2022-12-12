/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.metastorage.common.command;

import org.apache.ignite.internal.raft.ReadCommand;
import org.apache.ignite.network.annotations.Transferable;

/**
 * Get command for MetaStorageCommandListener that retrieves an entry for the given key and the revision upper bound, if latter is present.
 */
@Transferable(MetastorageCommandsMessageGroup.GET)
public interface GetCommand extends ReadCommand {
    /**
     * Returns key. Couldn't be {@code null}.
     */
    byte[] key();

    /**
     * Returns the upper bound for entry revisions, or {@code null} if wasn't specified.
     */
    long revision();
}
