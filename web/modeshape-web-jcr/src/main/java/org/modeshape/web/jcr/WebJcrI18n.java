/*
 * ModeShape (http://www.modeshape.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.modeshape.web.jcr;

import org.modeshape.common.annotation.Immutable;
import org.modeshape.common.i18n.I18n;

/**
 * The internationalized string constants for the <code>org.modeshape.web.jcr*</code> packages.
 *
 * @author Horia Chiorean (hchiorea@redhat.com)
 */
@Immutable
public class WebJcrI18n {
    public static I18n repositoriesContainerNotFoundInClasspath;
    public static I18n cannotInitializeRepository;
    public static I18n repositoryNotFound;
    public static I18n cannotLoadRepositoryNames;

    static {
        try {
            I18n.initialize(WebJcrI18n.class);
        } catch (final Exception err) {
            System.err.println(err);
        }
    }
}
