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

package org.apache.ignite.internal.table.distributed.raft.snapshot.outgoing;

import java.util.UUID;

/**
 * Registry of {@link OutgoingSnapshot}s.
 */
public interface OutgoingSnapshotRegistry {
    /**
     * Register a snapshot with the registry.
     *
     * @param snapshotId ID of the snapshot.
     * @param outgoingSnapshot Snapshot itself.
     */
    void registerOutgoingSnapshot(UUID snapshotId, OutgoingSnapshot outgoingSnapshot);

    /**
     * Unregisters a snapshot with the given ID.
     *
     * @param snapshotId Snapshot ID.
     */
    void unregisterOutgoingSnapshot(UUID snapshotId);
}