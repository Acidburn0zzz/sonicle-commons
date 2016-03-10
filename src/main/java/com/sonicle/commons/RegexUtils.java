/*
 * sonicle-commons is a helper library developed by Sonicle S.r.l.
 * Copyright (C) 2014 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle@sonicle.com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2014 Sonicle S.r.l.".
 */
package com.sonicle.commons;

/**
 *
 * @author malbinola
 */
public class RegexUtils {
	
	public static final String MATCH_ANY = ".*";
	public static final String MATCH_URL_SEPARATOR = "\\/";
	
	public static final String MATCH_JAVA_PACKAGE = "(?:[a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*";
	public static final String MATCH_SW_VERSION = "[0-9]+(?:\\.[0-9]+){1,2}";
	
	public static final String MATCH_SCHEME = "[A-Za-z][A-Za-z0-9+.-]*"; //Also called 'protocol'
	public static final String MATCH_AUTHORITY = "\\/{2}";
	public static final String MATCH_USERINFO = "(?:[A-Za-z0-9-._~]|%[A-Fa-f0-9]{2})+(?::(?:[A-Za-z0-9-._~]|%[A-Fa-f0-9]{2})+)?";
	public static final String MATCH_HOST = "(?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\\.){1,126}[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?";
	public static final String MATCH_PORT = "\\d+";
	public static final String MATCH_PATH = "\\/(?:[A-Za-z0-9-._~]|%[A-Fa-f0-9]{2})*";
	public static final String MATCH_QUERY = "\\?(?:[A-Za-z0-9-._~]+(?:=(?:[A-Za-z0-9-._~+]|%[A-Fa-f0-9]{2})+)?)(?:[&|;][A-Za-z0-9-._~]+(?:=(?:[A-Za-z0-9-._~+]|%[A-Fa-f0-9]{2})+)?)*";
	
	/**
	 * Matches a URI ()
	 * Examples:
	 * ssh://user@host.example.com
	 * 
	 */
	public static final String MATCH_URI = "(" + MATCH_SCHEME + "):" + MATCH_AUTHORITY + "(?:(" + MATCH_USERINFO + ")@)?(" + MATCH_HOST + ")(?::(" + MATCH_PORT + "))?";
	
	
	public static String capture(String pattern) {
		return "(" + pattern + ")";
	}
}