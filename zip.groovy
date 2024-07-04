// g100pon #43 zip圧縮・解凍
//
// Usage : groovy zip zipfile [file ...]


if( args.length<2 ){
	println 'error'
	System.exit(0)
}

// 1)
zipfile = args[0]

// 2)
filelist = []
args.each { filelist.add(it) }
filelist.remove(0)

sb = ''<<''
filelist.each{ sb << it << ' ' }

// 3)
new AntBuilder().zip(destfile:zipfile, basedir:'.',includes:"${sb.toString()}")
