/*
 * Copyright 2019 etrace.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.etrace.common.message.metric.impl;

import io.etrace.common.message.metric.Payload;
import io.etrace.common.message.metric.field.MetricType;

public class DummyPayload extends AbstractDummyMetric<Payload> implements Payload {

    @Override
    public void value(long value) {
    }

    @Override
    public MetricType getMetricType() {
        return MetricType.Payload;
    }
}
