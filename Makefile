
all:
	dune build @install -p scalafromwhy3 && dune install scalafromwhy3

clean:
	dune clean
