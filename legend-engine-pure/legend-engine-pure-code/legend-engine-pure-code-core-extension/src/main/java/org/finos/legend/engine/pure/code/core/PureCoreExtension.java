// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.pure.code.core;

import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.factory.Lists;
import org.finos.legend.pure.generated.Root_meta_pure_extension_Extension;
import org.finos.legend.pure.m3.execution.ExecutionSupport;

public interface PureCoreExtension
{
    default RichIterable<? extends Root_meta_pure_extension_Extension> extraPureCoreExtensions(ExecutionSupport es)
    {
        return Lists.fixedSize.empty();
    }
}
