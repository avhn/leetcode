## Contributing

### File structure

<pre>
├── Problem# <i>[e.g. "Problem444"]</i>
│   ├── README.md <i>[Description of problem]</i>
│   ├── code files
├── assets
├── README.md
├── CONTRIBUTING.md
</pre>

### Adding problems

Use orphan branches to commit freely and keep main branch clean.

```
$ git checkout --orphan $branchName
```

When you're done, squash merge to main branch according to the file structure.

```
$ git checkout $mainBranch
$ git merge --squash --allow-unrelated-histories $branchName
$ git commit
```

Now, you can make a pull request.


