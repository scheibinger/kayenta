/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.kayenta.canary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CanaryConfig {

  @NotNull
  @Getter
  @Setter
  private String name;

  @NotNull
  @Getter
  private String description;

  @NotNull
  @Getter
  private String configVersion;

  // TODO(duftler): Add support for timestamps. Would like to keep CanaryConfig immutable though.
//  @NotNull
//  @Getter
//  @Setter
//  private long createdTimestamp;
//
//  @NotNull
//  @Getter
//  @Setter
//  private long updatedTimestamp;

  @NotNull
  @Singular
  @Getter
  private List<CanaryMetricConfig> metrics;

  @NotNull
  @Singular
  @Getter
  private Map<String, CanaryServiceConfig> services;
}