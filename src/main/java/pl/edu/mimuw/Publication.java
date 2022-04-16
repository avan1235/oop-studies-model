package pl.edu.mimuw;

public class Publication implements Comparable <Publication>
{
	private final int doi;

	public Publication(int _doi)
	{
		doi = _doi;
	}

	public int getDoi()
	{
		return doi;
	}

	@Override
	public int compareTo(Publication other)
	{
		return Integer.compare(doi, other.getDoi());
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append("Publication DOI code: ").append(doi).append('\n');
		return sb.toString();
	}
}