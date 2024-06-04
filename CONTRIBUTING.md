# Getting Started

The PayPal Node SDK utlizes the DPE Build Pipeline, as such your flow should be as follows:

## Checkout the repository

```sh
git clone https://github.paypal.com/PayPal-R/paypal-node
```

## Checkout the development branch (main) and make sure you have the latest changes from your upstream

```sh
cd paypal-node
git checkout main
git pull
```

## Start a feature branch linked to a Jira ticket

```sh
git checkout -b feature/JIRATICKET-123
```

## Push your new branch

```sh
git push -u origin feature/JIRATICKET-123
```

## Code and push your changes as usual

- Once the tests of your feature branch pass submit a Pull Request to the `main` Branch.
- Once approved, merge your changes. NOTE: Unless labeled otherwise, a maintainer may merge your code after reviewing.

# Details about the DPE Build Pipeline

The PayPal Node SDK utilizes the [Node DPE Build Pipeline](https://github.paypal.com/pages/EPX-Pipelines-R/jenkins-nodejs-pipelines/). This introduces some specifics around branches.

The Node.js Build Pipeline will begin tracking all branches and forks that include a Jenkins/Jenkinsfile. And that are named:

- main
- master
- develop
- release
- feature/\*
- release/\*
- hotfix/\*

It's important to note that the Pipeline makes use of the [Git Flow Workflow](https://danielkummer.github.io/git-flow-cheatsheet/) as a framework to automate what actions are allowed on a particular branch. For details on how gitflow functions here's a [quick overview](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow) and a [detailed explanation](https://nvie.com/posts/a-successful-git-branching-model/).

In a nutshell, the GitFlow Release Pipeline's job is to automate the process to merge the code of your Integration Branch (develop) into your Main Branch (main).

Additionally, it will:

- Bump the version of your application to the selected next production release.
- Generate release notes for commits that are linked to a Jira Ticket.
- Tag the HEAD of your Main Branch with the version you are releasing.
- Generate a GitHub release page based on the new Release Tag and Notes.
- Finally, it will merge your changes back to your Integration Branch; and
- Bump the version of your Integration Branch to the selected next development release.
