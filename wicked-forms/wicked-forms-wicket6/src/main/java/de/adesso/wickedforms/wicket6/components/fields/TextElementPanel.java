/**
 *   Copyright 2013 Wicked Forms (https://github.com/thombergs/wicked-forms)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedforms.wicket6.components.fields;

import org.apache.wicket.markup.html.basic.Label;
import de.adesso.wickedforms.model.elements.Text;

/**
 * A panel that represents a {@link Text} in a form.
 * <p/>
 * <strong>Wicket IDs needed in the markup:</strong>
 * <ul>
 * <li><strong>text</strong>: a {@link Label} that displays the text.
 * </ul>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class TextElementPanel extends AbstractFormElementPanel {

	public TextElementPanel(String id, Text model) {
		super(id, model);
		Label label = new Label("text", model.getValue());
		add(label);
	}

}
