package com.gmail.tsikalenko.nikita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Font {
	public Map<Character, List<String>> star = new HashMap<>();

	public Font() {
		super();
		addLetter();
	}

	public void addLetter() {
		List<String> a = new ArrayList<>();

		a.add("           ");
		a.add("  * * * *  ");
		a.add("        *  ");
		a.add("  * * * *  ");
		a.add("  *     *  ");
		a.add("  * * * *  ");

		star.put('a', a);

		List<String> b = new ArrayList<>();

		b.add("  *        ");
		b.add("  *        ");
		b.add("  *        ");
		b.add("  * * * *  ");
		b.add("  *     *  ");
		b.add("  * * * *  ");

		star.put('b', b);

		List<String> c = new ArrayList<>();

		c.add("  * * * *  ");
		c.add("  *        ");
		c.add("  *        ");
		c.add("  *        ");
		c.add("  *        ");
		c.add("  * * * *  ");

		star.put('c', c);

		List<String> d = new ArrayList<>();

		d.add("        *  ");
		d.add("        *  ");
		d.add("        *  ");
		d.add("  * * * *  ");
		d.add("  *     *  ");
		d.add("  * * * *  ");

		star.put('d', d);

		List<String> e = new ArrayList<>();

		e.add("           ");
		e.add("  * * * *  ");
		e.add("  *     *  ");
		e.add("  * * * *  ");
		e.add("  *        ");
		e.add("  * * * *  ");

		star.put('e', e);

		List<String> f = new ArrayList<>();

		f.add("  * * * *  ");
		f.add("  *        ");
		f.add("  * * * *  ");
		f.add("  *        ");
		f.add("  *        ");
		f.add("  *        ");

		star.put('f', f);

		List<String> g = new ArrayList<>();

		g.add("  * * * *  ");
		g.add("  *        ");
		g.add("  *        ");
		g.add("  *   * *  ");
		g.add("  *     *  ");
		g.add("  * * * *  ");

		star.put('g', g);

		List<String> h = new ArrayList<>();

		h.add("  *        ");
		h.add("  *        ");
		h.add("  *        ");
		h.add("  * * * *  ");
		h.add("  *     *  ");
		h.add("  *     *  ");

		star.put('h', h);

		List<String> i = new ArrayList<>();

		i.add("     *     ");
		i.add("     *     ");
		i.add("     *     ");
		i.add("     *     ");
		i.add("     *     ");
		i.add("     *     ");

		star.put('i', i);

		List<String> j = new ArrayList<>();

		j.add("        *  ");
		j.add("        *  ");
		j.add("        *  ");
		j.add("        *  ");
		j.add("  *     *  ");
		j.add("    * *    ");

		star.put('j', j);

		List<String> k = new ArrayList<>();

		k.add("  *   *    ");
		k.add("  *  *     ");
		k.add("  * *      ");
		k.add("  * *      ");
		k.add("  *   *    ");
		k.add("  *     *  ");

		star.put('k', k);

		List<String> l = new ArrayList<>();

		l.add("  *        ");
		l.add("  *        ");
		l.add("  *        ");
		l.add("  *        ");
		l.add("  *        ");
		l.add("  * * * *  ");

		star.put('l', l);

		List<String> m = new ArrayList<>();

		m.add("           ");
		m.add("* * * * *  ");
		m.add("*   *    * ");
		m.add("*   *    * ");
		m.add("*   *    * ");
		m.add("*   *    * ");

		star.put('m', m);

		List<String> n = new ArrayList<>();

		n.add("           ");
		n.add("  * * *    ");
		n.add("  *     *  ");
		n.add("  *     *  ");
		n.add("  *     *  ");
		n.add("  *     *  ");

		star.put('n', n);
		
		List<String> o = new ArrayList<>();

		o.add("           ");
		o.add("  * * * *  ");
		o.add("  *     *  ");
		o.add("  *     *  ");
		o.add("  *     *  ");
		o.add("  * * * *  ");

		star.put('o', o);
		
		List<String> p = new ArrayList<>();

		p.add("  * * * *  ");
		p.add("  *     *  ");
		p.add("  *     *  ");
		p.add("  * * * *  ");
		p.add("  *        ");
		p.add("  *        ");

		star.put('p', p);
		
		List<String> q = new ArrayList<>();

		q.add("           ");
		q.add("    * * *  ");
		q.add("  *     *  ");
		q.add("    * * *  ");
		q.add("        *  ");
		q.add("        ** ");

		star.put('q', q);
		
		List<String> r = new ArrayList<>();

		r.add("           ");
		r.add("  * * *    ");
		r.add("  *     *  ");
		r.add("  *        ");
		r.add("  *        ");
		r.add("  *        ");

		star.put('r', r);
		
		List<String> s = new ArrayList<>();

		s.add("  * * * *  ");
		s.add("  *        ");
		s.add("  * * * *  ");
		s.add("        *  ");
		s.add("        *  ");
		s.add("  * * * *  ");

		star.put('s', s);
		
		List<String> t = new ArrayList<>();

		t.add("    *      ");
		t.add("  * * *    ");
		t.add("    *      ");
		t.add("    *      ");
		t.add("    *      ");
		t.add("      * *  ");

		star.put('t', t);
		
		List<String> u = new ArrayList<>();

		u.add("           ");
		u.add("  *     *  ");
		u.add("  *     *  ");
		u.add("  *     *  ");
		u.add("  *     *  ");
		u.add("    * *  * ");

		star.put('u', u);
		
		List<String> v = new ArrayList<>();

		v.add("           ");
		v.add("           ");
		v.add("  *     *  ");
		v.add("  *     *  ");
		v.add("   *   *   ");
		v.add("     *     ");

		star.put('v', v);
		
		List<String> w = new ArrayList<>();

		w.add("           ");
		w.add("           ");
		w.add(" *       * ");
		w.add(" *       * ");
		w.add("  *  *  *  ");
		w.add("    * *    ");

		star.put('w', w);
		
		List<String> x = new ArrayList<>();

		x.add("           ");
		x.add("  *     *  ");
		x.add("    * *    ");
		x.add("     *     ");
		x.add("    * *    ");
		x.add("  *     *  ");

		star.put('x', x);
		
		List<String> y = new ArrayList<>();

		y.add("           ");
		y.add("  *     *  ");
		y.add("  *     *  ");
		y.add("   * * **  ");
		y.add("        *  ");
		y.add("      **   ");

		star.put('y', y);
		
		List<String> z = new ArrayList<>();

		z.add("           ");
		z.add("  *  * **  ");
		z.add("       *   ");
		z.add("     *     ");
		z.add("   *       ");
		z.add("  * * * *  ");

		star.put('z', z);
		
		List<String> scape = new ArrayList<>();

		scape.add("           ");
		scape.add("           ");
		scape.add("           ");
		scape.add("           ");
		scape.add("           ");
		scape.add("           ");

		star.put(' ', scape);
		
		List<String> atantion = new ArrayList<>();

		atantion.add("     *     ");
		atantion.add("     *     ");
		atantion.add("     *     ");
		atantion.add("     *     ");
		atantion.add("           ");
		atantion.add("     *     ");

		star.put('!', atantion);
		
		List<String> quation = new ArrayList<>();

		quation.add("     * *   ");
		quation.add("   *     * ");
		quation.add("         * ");
		quation.add("       *   ");
		quation.add("      *    ");
		quation.add("      *    ");

		star.put('?', quation);
		
	}

	public Map<Character, List<String>> getStar() {
		return star;
	}

}
