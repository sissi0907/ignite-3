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

package org.apache.ignite.internal.tx.message;

import org.apache.ignite.network.annotations.Marshallable;
import org.apache.ignite.network.annotations.Transferable;

/**
 * Cleanup transaction message error response.
 */
@Transferable(TxMessageGroup.TX_CLEANUP_MSG_ERR_RESPONSE)
public interface TxCleanupMessageErrorResponse extends TxCleanupMessageResponse {
    /**
     * Returns a {@link Throwable} that was thrown during handling a lock release message.
     *
     * @return {@link Throwable} that was thrown during handling a lock release message.
     */
    @Marshallable
    Throwable throwable();
}