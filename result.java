permute{
	i=0
	out = a
	0=t
	permute{
		i=0
		i=1
		out = ab
		0,1 = t
		permute{
			i=0
			i=1
			i=2
			out = abc
			0,1,2 = t
			permute{
				i=0
				i=1
				i=2
				i=3
				out = abcd
				0,1,2,3=t
				permute{
					return
				}
				i=3
				3=f
				0,1,2 = t
				out = abc
			}
			i=2
			2,3 = f
			out = ab
			i = 3
			out = abd
			3 = t
			0,1,3=t
			2=f
			permute{
				i=0,1
				i=2
				out=abdc
				2=t
				0,1,2,3=t
				permute{
					return 
				}
				2=f
				out=abd
				i=3
			}
			3=f
			out = ab
		}
		i=1
		1=f
		out=a
		i=2
		out=ac
		0,2=t
		3=f
		1=f
		permute{
			i=0
			i=1
			out=acb
			0,1,2=t
			i=2
			i=3
			out = acbd
			0,1,2,3=t
			permute{
				return
			}
			3=f
			out=acb
			
		}
		2=f
		out=ac
		i=3
		out=acd
		3=t
		permute{
			i=2
			out=
		}
	}
}