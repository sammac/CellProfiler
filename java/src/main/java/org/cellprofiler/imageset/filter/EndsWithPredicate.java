/**
 * CellProfiler is distributed under the GNU General Public License.
 * See the accompanying file LICENSE for details.
 *
 * Copyright (c) 2003-2009 Massachusetts Institute of Technology
 * Copyright (c) 2009-2013 Broad Institute
 * All rights reserved.
 * 
 * Please see the AUTHORS file for credits.
 * 
 * Website: http://www.cellprofiler.org
 */
package org.cellprofiler.imageset.filter;

/**
 * @author Lee Kamentsky
 *
 * A predicate that tests whether the candidate ends with the literal.
 */
public class EndsWithPredicate extends AbstractStringPredicate {
	final static public String SYMBOL = "endwith";
	/* (non-Javadoc)
	 * @see org.cellprofiler.imageset.filter.FilterPredicate#getSymbol()
	 */
	public String getSymbol() {
		return SYMBOL;
	}

	/* (non-Javadoc)
	 * @see org.cellprofiler.imageset.filter.AbstractStringPredicate#eval(java.lang.String, java.lang.String)
	 */
	@Override
	protected boolean eval(String candidate, String literal) {
		return candidate.endsWith(literal);
	}

}
