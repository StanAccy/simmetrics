/*
 * SimMetrics - SimMetrics is a java library of Similarity or Distance Metrics,
 * e.g. Levenshtein Distance, that provide float based similarity measures
 * between String Data. All metrics return consistent measures rather than
 * unbounded similarity scores.
 * 
 * Copyright (C) 2014 SimMetrics authors
 * 
 * This file is part of SimMetrics. This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * SimMetrics. If not, see <http://www.gnu.org/licenses/>.
 */

package org.simmetrics;

import java.util.Collections;
import java.util.List;
/**
 * Measures the similarity between two lists. The measurement results in a value
 * between 0 and 1 inclusive. A value of zero indicates that the lists are
 * dissimilar, a value of 1 indicates they are similar.
 * 
 * <p>
 * The elements in the lists have to implement {@link Object#hashCode()} and
 * {@link Object#equals(Object)}.
 * <p>
 * Implementations may not modify the contents of the set. Sets should be
 * treated as if wrapped by {@link Collections#unmodifiableList(List)}.
 * 
 * @author mpkorstanje
 * @param <T>
 *            the type of elements contained in the lists
 *
 */
public interface ListMetric<T> {
	/**
	 * Measures the similarity between lists a and b. The measurement results in
	 * a value between 0 and 1 inclusive. A value of zero indicates that the
	 * lists are dissimilar, a value of 1 indicates they are similar.
	 * 
	 * @param a
	 *            set a to compare
	 * @param b
	 *            set b to compare
	 * @return a value between 0 and 1 inclusive indicating similarity
	 */
	public float compare(List<T> a, List<T> b);


}
