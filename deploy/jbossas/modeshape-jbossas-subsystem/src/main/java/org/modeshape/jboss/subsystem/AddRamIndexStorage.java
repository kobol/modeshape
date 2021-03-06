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
package org.modeshape.jboss.subsystem;

import org.infinispan.schematic.document.EditableDocument;
import org.jboss.as.controller.OperationContext;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.dmr.ModelNode;
import org.modeshape.jcr.RepositoryConfiguration;

/**
 * 
 */
public class AddRamIndexStorage extends AbstractAddIndexStorage {

    public static final AddRamIndexStorage INSTANCE = new AddRamIndexStorage();

    private AddRamIndexStorage() {
    }

    @Override
    protected void writeIndexStorageConfiguration( final OperationContext context,
                                                   final ModelNode storage,
                                                   EditableDocument indexStorage,
                                                   String repositoryName ) {
        indexStorage.set(RepositoryConfiguration.FieldName.TYPE, RepositoryConfiguration.FieldValue.INDEX_STORAGE_RAM);
    }
    
    @Override
    protected void populateModel( ModelNode operation,
                                  ModelNode model ) throws OperationFailedException {
        populate(operation, model, ModelKeys.RAM_INDEX_STORAGE, ModelAttributes.RAM_INDEX_STORAGE_ATTRIBUTES);
    }
}
