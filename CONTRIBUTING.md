### Adding problems

Use branches to commit freely and keep main branch clean.

```
$ git checkout $branchName
```

When you're done, squash merge to main branch according to the file structure.

```
$ git checkout $mainBranch
$ git merge --squash $branchName
$ git commit
```

Now, you can make a pull request.
